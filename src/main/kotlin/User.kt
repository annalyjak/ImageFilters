
// Creational: Builder for creating user.
// User class also works as a UserState Context

class User private constructor(
    private val username: String,
    private val password: String,
    private val email: String,
    private val phone: String,
    private var state: UserState = GuestUserState()) : UserState{

    fun getAccountDetails() = println(
        "Username: $username\n" +
        "Email: $email\n" +
        "Phone: $phone")

    override fun canRemoveWatermark(): Boolean {
        return this.state.canRemoveWatermark()
    }

    fun setUserState(state: UserState){
        this.state = state
    }

    fun getUserState() : UserState{
        return this.state
    }

    class UserBuilder(
        private var username: String,
        private var password: String,
    ) {
        private var email: String = ""
        private var phone: String = ""

        fun setUsername(username: String) = apply { this.username = username }
        fun setPassword(password: String) = apply { this.password = password }
        fun setEmail(email: String) = apply { this.email = email }
        fun setPhone(phone: String) = apply { this.phone = phone }
        fun build() = User(username, password, email, phone)
    }

}