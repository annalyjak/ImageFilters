package domain

import state.AccountState

class Image(val imageName: String) {
    private var watermark: String = "-"

    fun displayImage() {
        println("Displaying image: $imageName. " + "Watermark: $watermark")
    }

    fun setWatermark(watermark: String) {
        this.watermark = watermark
    }

    fun removeWatermark(accountState: AccountState) {
        if (accountState.canRemoveWatermark()) {
            this.watermark = "-"
            println("Watermark removed. ")
        } else {
            println("You have no permission to remove Watermark. Please change user state")
        }
    }
}