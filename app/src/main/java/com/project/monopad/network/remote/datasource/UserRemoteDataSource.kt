package com.project.monopad.network.remote.datasource

import com.google.android.gms.auth.api.signin.GoogleSignInAccount
import com.google.android.gms.tasks.Task
import com.google.firebase.auth.FirebaseUser
import com.project.monopad.network.remote.api.UserApiClient
import com.project.monopad.util.LoginMode
import io.reactivex.Completable
import io.reactivex.Single

interface UserRemoteDataSource {

    fun getCurrentFirebaseUser() : FirebaseUser?

    fun isAvailableEmail(email : String) : Single<Boolean>
    fun createUserWithEmailAndPassword(email: String, password: String, name: String) : Completable

    fun signInWithEmailAndPassword(email: String, password: String) : Completable
    fun signInWithGoogle(task: Task<GoogleSignInAccount>) : Completable

    fun signOut(mode : LoginMode) : Completable
}