class BasicImageFilter : ImageFilterInterface {
    override fun applyFilter(image: Image): Image {
        val brandWatermark = "** Brand Watermark **"

        println("Applying Basic Image Filter. ")
        // some logic here
        println("Adding watermark: $brandWatermark")
        image.setWatermark(brandWatermark)
        return image
    }
}