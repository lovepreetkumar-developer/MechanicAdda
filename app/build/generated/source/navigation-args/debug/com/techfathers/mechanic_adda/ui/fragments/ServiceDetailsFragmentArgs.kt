package com.techfathers.mechanic_adda.ui.fragments

import android.os.Bundle
import android.os.Parcelable
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import com.techfathers.mechanic_adda.models.ServiceModel
import java.io.Serializable
import java.lang.UnsupportedOperationException
import kotlin.Suppress
import kotlin.jvm.JvmStatic

public data class ServiceDetailsFragmentArgs(
  public val serviceModel: ServiceModel? = null
) : NavArgs {
  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toBundle(): Bundle {
    val result = Bundle()
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
    if (Parcelable::class.java.isAssignableFrom(ServiceModel::class.java)) {
      result.set("service_model", this.serviceModel as Parcelable?)
    } else if (Serializable::class.java.isAssignableFrom(ServiceModel::class.java)) {
      result.set("service_model", this.serviceModel as Serializable?)
    }
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): ServiceDetailsFragmentArgs {
      bundle.setClassLoader(ServiceDetailsFragmentArgs::class.java.classLoader)
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
      return ServiceDetailsFragmentArgs(__serviceModel)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle):
        ServiceDetailsFragmentArgs {
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
      return ServiceDetailsFragmentArgs(__serviceModel)
    }
  }
}
