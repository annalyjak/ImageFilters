package decorator

import domain.Image

class SepiaDecorator(private val filter: ImageFilterInterface) : ImageFilterInterface {
    override fun applyFilter(image: Image): Image {
        val processedImage = filter.applyFilter(image)
        println("Applying Sepia filter. ")
        // some logic here
        return processedImage
    }
}