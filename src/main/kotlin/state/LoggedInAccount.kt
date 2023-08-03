package state

object LoggedInAccount : AccountState {
    override fun canRemoveWatermark(): Boolean {
        return true
    }
}