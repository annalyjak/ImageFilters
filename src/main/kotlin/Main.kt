import decorator.BlurDecorator
import decorator.SepiaDecorator
import domain.Image
import domain.User
import filters.BasicImageFilter
import state.LoggedInAccount

fun main(args: Array<String>) {

    // ** Builder

    val user1: User = User.UserBuilder(username = "Tadeusz R", password = "ElanaTorun").build()
    val user2: User = User.UserBuilder(username = "JuanPablo", password = "LubieKremufki69")
        .setEmail("juan.pablo@gmail.com")
        .setPhone("666 666 666")
        .build()

    user1.getAccountDetails()
    println("---")
    user2.getAccountDetails()

    println("-----------------")

    // ** Decorator

    // Add Basic Filter
    val image1 = Image("JP2_Image.jpg")
    image1.displayImage()
    val basicFilter = BasicImageFilter()

    println("---")

    // Add Sepia
    val image2 = Image("JP2_Sepia")
    val sepiaFilter = SepiaDecorator(basicFilter)
    val imageWithSepia = sepiaFilter.applyFilter(image2)
    imageWithSepia.displayImage()

    println("---")

    // Add Blur
    val image3 = Image("JP2_Blur")
    val blurFilter = BlurDecorator(basicFilter)
    val imageWithBlur = blurFilter.applyFilter(image3)
    imageWithBlur.displayImage()

    println("---")

    // Add Sepia and Blur
    val image4 = Image("JP2_Sepia_And_Blur")
    val sepiaAndBlurFilter = SepiaDecorator(BlurDecorator(basicFilter))
    val imageWithSepiaAndBlur = sepiaAndBlurFilter.applyFilter(image4)
    imageWithSepiaAndBlur.displayImage()

    println("-----------------")

    // ** State
    image4.removeWatermark(user1.getUserState())
    image4.displayImage()
    println("---")

    user2.setUserState(LoggedInAccount)
    image4.removeWatermark(user2.getUserState())
    image4.displayImage()

}
