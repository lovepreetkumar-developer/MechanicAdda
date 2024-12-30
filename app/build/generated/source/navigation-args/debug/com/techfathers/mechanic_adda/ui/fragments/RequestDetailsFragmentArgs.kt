package com.techfathers.mechanic_adda.ui.fragments

import android.os.Bundle
import android.os.Parcelable
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import com.techfathers.mechanic_adda.models.RequestModel
import java.io.Serializable
import java.lang.IllegalArgumentException
import java.lang.UnsupportedOperationException
import kotlin.Suppress
import kotlin.jvm.JvmStatic

public data class RequestDetailsFragmentArgs(
  public val requestModel: RequestModel
) : NavArgs {
  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toBundle(): Bundle {
    val result = Bundle()
    if (Parcelable::class.java.isAssignableFrom(RequestModel::class.java)) {
      result.putParcelable("request_model", this.requestModel as Parcelable)
    } else if (Serializable::class.java.isAssignableFrom(RequestModel::class.java)) {
      result.putSerializable("request_model", this.requestModel as Serializable)
    } else {
      throw UnsupportedOperationException(RequestModel::class.java.name +
          " must implement Parcelable or Serializable or must be an Enum.")
    }
    return result
  }

  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    if (Parcelable::class.java.isAssignableFrom(RequestModel::class.java)) {
      result.set("request_model", this.requestModel as Parcelable)
    } else if (Serializable::class.java.isAssignableFrom(RequestModel::class.java)) {
      result.set("request_model", this.requestModel as Serializable)
    } else {
      throw UnsupportedOperationException(RequestModel::class.java.name +
          " must implement Parcelable or Serializable or must be an Enum.")
    }
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): RequestDetailsFragmentArgs {
      bundle.setClassLoader(RequestDetailsFragmentArgs::class.java.classLoader)
      val __requestModel : RequestModel?
      if (bundle.containsKey("request_model")) {
        if (Parcelable::class.java.isAssignableFrom(RequestModel::class.java) ||
            Serializable::class.java.isAssignableFrom(RequestModel::class.java)) {
          __requestModel = bundle.get("request_model") as RequestModel?
        } else {
          throw UnsupportedOperationException(RequestModel::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__requestModel == null) {
          throw IllegalArgumentException("Argument \"request_model\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"request_model\" is missing and does not have an android:defaultValue")
      }
      return RequestDetailsFragmentArgs(__requestModel)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle):
        RequestDetailsFragmentArgs {
      val __requestModel : RequestModel?
      if (savedStateHandle.contains("request_model")) {
        if (Parcelable::class.java.isAssignableFrom(RequestModel::class.java) ||
            Serializable::class.java.isAssignableFrom(RequestModel::class.java)) {
          __requestModel = savedStateHandle.get<RequestModel?>("request_model")
        } else {
          throw UnsupportedOperationException(RequestModel::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__requestModel == null) {
          throw IllegalArgumentException("Argument \"request_model\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"request_model\" is missing and does not have an android:defaultValue")
      }
      return RequestDetailsFragmentArgs(__requestModel)
    }
  }
}
