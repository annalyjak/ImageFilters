package filters

import decorator.ImageFilterInterface
import domain.Image

class BasicImageFilter : ImageFilterInterface {
    override fun applyFilter(image: Image): Image {
        val brandWatermark = "** Brand Watermark **"

        println("Applying Basic domain.Image Filter. ")
        // some logic here
        println("Adding watermark: $brandWatermark")
        image.setWatermark(brandWatermark)
        return image
    }
}