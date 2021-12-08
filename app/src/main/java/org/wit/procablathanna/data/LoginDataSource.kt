package org.wit.procablathanna.data
import org.wit.procablathanna.data.model.LoggedInUser
import java.io.IOException

class LoginDataSource {
    fun logout() {
        // TODO: revoke authentication
    }

    /**
     * Class that handles authentication w/ login credentials and retrieves user information.
     */


        fun login(username: String, password: String): Result<LoggedInUser> {
            try {
                // TODO: handle loggedInUser authentication
                val fakeUser = LoggedInUser(java.util.UUID.randomUUID().toString(), "Jane Doe")
                return Result.Success(fakeUser)
            } catch (e: Throwable) {
                return Result.Error(IOException("Error logging in", e))
            }
        }


    }
