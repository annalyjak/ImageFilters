class GuestUserState : UserState {
    override fun canRemoveWatermark(): Boolean {
        return false
    }
}