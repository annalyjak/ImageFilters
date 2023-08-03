package domain

import state.GuestAccount
import state.AccountState

// Creational: Builder for creating user.
// domain.User class also works as a state.UserState Context

class User private constructor(
    private val username: String,
    private val password: String,
    private val email: String,
    private val phone: String,
    private var state: AccountState = GuestAccount // there is no need to keep implementation and the state as a separate element
) {
    // the best way was to do not keep state of account here - you could moved it to separate class - sth like repository and call it only when it is required - do not keep thinks "not related" in one class - try to think in "contexts"

    fun getAccountDetails() = println(
        "Username: $username\n" +
                "Email: $email\n" +
                "Phone: $phone"
    )

    fun setUserState(state: AccountState) {
        this.state = state
    }

    fun getUserState(): AccountState {
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