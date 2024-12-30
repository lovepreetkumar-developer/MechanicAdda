package com.techfathers.mechanic_adda.ui.fragments

import android.os.Bundle
import android.os.Parcelable
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import com.techfathers.mechanic_adda.models.ServiceModel
import java.io.Serializable
import java.lang.IllegalArgumentException
import java.lang.UnsupportedOperationException
import kotlin.String
import kotlin.Suppress
import kotlin.jvm.JvmStatic

public data class BookRequestFragmentArgs(
  public val requestType: String = "",
  public val serviceModel: ServiceModel? = null
) : NavArgs {
  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putString("request_type", this.requestType)
    if (Parcelable::class.java.isAssignableFrom(ServiceModel::class.java)) {
      result.putParcelable("service_model", this.serviceModel as Parcelable?)
    } else if (Serializable::class.java.isAssignableFrom(ServiceModel::class.java)) {
      result.putSerializable("service_model", this.serviceModel as Serializable?)
    }
    return result
  }

  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    result.set("request_type", this.requestType)
    if (Parcelable::class.java.isAssignableFrom(ServiceModel::class.java)) {
      result.set("service_model", this.serviceModel as Parcelable?)
    } else if (Serializable::class.java.isAssignableFrom(ServiceModel::class.java)) {
      result.set("service_model", this.serviceModel as Serializable?)
    }
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): BookRequestFragmentArgs {
      bundle.setClassLoader(BookRequestFragmentArgs::class.java.classLoader)
      val __requestType : String?
      if (bundle.containsKey("request_type")) {
        __requestType = bundle.getString("request_type")
        if (__requestType == null) {
          throw IllegalArgumentException("Argument \"request_type\" is marked as non-null but was passed a null value.")
        }
      } else {
        __requestType = ""
      }
      val __serviceModel : ServiceModel?
      if (bundle.containsKey("service_model")) {
        if (Parcelable::class.java.isAssignableFrom(ServiceModel::class.java) ||
            Serializable::class.java.isAssignableFrom(ServiceModel::class.java)) {
          __serviceModel = bundle.get("service_model") as ServiceModel?
        } else {
          throw UnsupportedOperationException(ServiceModel::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
      } else {
        __serviceModel = null
      }
      return BookRequestFragmentArgs(__requestType, __serviceModel)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle): BookRequestFragmentArgs {
      val __requestType : String?
      if (savedStateHandle.contains("request_type")) {
        __requestType = savedStateHandle["request_type"]
        if (__requestType == null) {
          throw IllegalArgumentException("Argument \"request_type\" is marked as non-null but was passed a null value")
        }
      } else {
        __requestType = ""
      }
      val __serviceModel : ServiceModel?
      if (savedStateHandle.contains("service_model")) {
        if (Parcelable::class.java.isAssignableFrom(ServiceModel::class.java) ||
            Serializable::class.java.isAssignableFrom(ServiceModel::class.java)) {
          __serviceModel = savedStateHandle.get<ServiceModel?>("service_model")
        } else {
          throw UnsupportedOperationException(ServiceModel::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
      } else {
        __serviceModel = null
      }
      return BookRequestFragmentArgs(__requestType, __serviceModel)
    }
  }
}
