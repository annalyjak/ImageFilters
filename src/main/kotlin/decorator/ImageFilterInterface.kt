package decorator

import domain.Image

interface ImageFilterInterface {
    fun applyFilter(image: Image): Image
}