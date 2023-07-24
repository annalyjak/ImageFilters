class Image(val imageName: String) {
    private var watermark: String = "-"

    fun displayImage() {
        println("Displaying image: $imageName. " + "Watermark: $watermark" )
    }

    fun setWatermark(watermark: String){
        this.watermark = watermark
    }

    fun removeWatermark(userState: UserState) {
        if (userState.canRemoveWatermark()) {
            this.watermark = "-"
            println("Watermark removed. ")
        }
        else {
            println("You have no permission to remove Watermark. Please change user state")
        }

    }
}