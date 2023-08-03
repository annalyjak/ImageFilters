package state

object GuestAccount : AccountState {
    override fun canRemoveWatermark(): Boolean {
        return false
    }
}