package decorator

import domain.Image

class BlurDecorator(private val filter: ImageFilterInterface) : ImageFilterInterface {
    override fun applyFilter(image: Image): Image {
        val processedImage = filter.applyFilter(image)
        println("Applying Blur filter. ")
        // some logic here
        return processedImage
    }
}