class LoggedInUserState : UserState {
    override fun canRemoveWatermark(): Boolean {
        return true
    }
}