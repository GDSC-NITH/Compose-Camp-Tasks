open class Convert_rate(){
    protected val length = mapOf(
        "Kilometre" to 0.001,
        "Metre" to 1.0,
        "Centimetre" to 100.0,
        "Millimetre" to 1000.0,
        "Micrometre" to 1e+6,
        "Nanometre" to 1e+9,
        "Mile" to 0.000621371,
        "Yard" to 1.09361,
        "Foot" to 3.28084,
        "Inch" to 0.0254
    )
    protected val time = mapOf(
        "Nanosecond" to 6e+10,
        "Microsecond" to 6e+7,
        "Millisecond" to 6e+4,
        "Second" to 60.0,
        "Minute" to 1.0,
        "Hour" to 0.0167,
        "Day" to 0.000694,
        "Week" to 9.9206e-5,
        "Month" to 2.2831e-5,
        "Year" to 1.9026e-6,
        "Decade" to 1.9026e-7,
        "Century" to 1.9026e-8
    )
    protected val currency = mapOf(
        "Dollar" to 1.00,
        "INR" to 82.40,
        "Euro" to 1.03,
        "Dirham" to 3.67,
        "Kuwait_Dinar" to 0.31,
        "Russian_Ruble" to 62.15,
        "South_Korea_Won" to 1440.47,
        "Yen" to 148.68,
        "Australian_Dollar" to 1.61,
        "Bangladeshi_Taka" to 102.15
    )
}



class Convert_operation(): Convert_rate(){
    private var convertFrom : String = "Hour"
    private var convertTo : String ="Hour"
    private var amount : Double = 0.000000

    //Using this to decide how many decimal places need to be shown as output
    public fun set_value(
        convertFrom_temp: String,
        convertTo_temp: String,
        amount_temp: Double
    ){

        convertFrom = convertFrom_temp
        convertTo =convertTo_temp
        amount = amount_temp
    }
    public fun Conv_length():Double{
        var amount_new : Double = amount* length[convertTo]!!/ length[convertFrom]!!
        val number3digits:Double = Math.round(amount_new * 1000.0) / 1000.0
        return number3digits
    }

    public fun Conv_time():Double{
        var amount_new : Double = amount* time[convertTo]!!/ time[convertFrom]!!
        val number3digits:Double = Math.round(amount_new * 1000.0) / 1000.0
        return number3digits
    }

    public fun Conv_cur():Double{
        var amount_new : Double = amount*currency[convertTo]!!/ currency[convertFrom]!!
        val number3digits:Double = Math.round(amount_new * 1000.0) / 1000.0
        return number3digits
    }
}



fun main() {
    println("Enter which convertor you need, 1 for length, 2 for currency , 3 for time,4 for computer to select convertor")
    var conv_type: String? = readLine()
    var conv_type_int: Int = (conv_type?.toInt() ?: 0) as Int

    // Using Random function to Select a convertor
    if (conv_type_int == 4) {
        conv_type_int = (1..3).random()
    }
    when (conv_type_int) {
        1 -> println("You got length Convertor")
        2 -> println("You got currency Convertor")
        3 -> println("You got time convertor")
        else -> println("Enter Correct Inputs")
    }

    println("Enter convert from , convert to and then amount for conversion")
    var conv_from: String? = readLine()
    var conv_to: String? = readLine()
    var value_temp: String? = readLine()

    var value: Double = (value_temp?.toDouble() ?: 0) as Double

    var operation = Convert_operation()

    //Updating Values
    if (conv_to != null) {
        if (conv_from != null) {
            operation.set_value(conv_from, conv_to, value)
        }
    }

    //Output
    when (conv_type_int) {
        1 -> println("${operation.Conv_length()} $conv_to")
        2 -> println("${operation.Conv_cur()} $conv_to")
        3 -> println("${operation.Conv_time()} $conv_to")
        else -> println("Enter Correct Inputs")
    }
}
