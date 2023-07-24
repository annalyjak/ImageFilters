class CompressionDecorator(private val filter: ImageFilterInterface) : ImageFilterInterface {
    override fun applyFilter(image: Image): Image {
        val processedImage = filter.applyFilter(image)
        println("Applying Compression filter. ")
        // some logic here
        return processedImage
    }
}