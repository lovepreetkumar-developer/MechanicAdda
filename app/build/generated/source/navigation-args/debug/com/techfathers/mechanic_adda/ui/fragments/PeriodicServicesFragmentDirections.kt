package com.techfathers.mechanic_adda.ui.fragments

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavDirections
import com.techfathers.mechanic_adda.R
import com.techfathers.mechanic_adda.models.ServiceModel
import java.io.Serializable
import kotlin.Int
import kotlin.Suppress

public class PeriodicServicesFragmentDirections private constructor() {
  private data class ActionPeriodicServicesFragmentToServiceDetailsFragment(
    public val serviceModel: ServiceModel? = null
  ) : NavDirections {
    public override val actionId: Int =
        R.id.action_periodic_services_fragment_to_service_details_fragment

    public override val arguments: Bundle
      @Suppress("CAST_NEVER_SUCCEEDS")
      get() {
        val result = Bundle()
        if (Parcelable::class.java.isAssignableFrom(ServiceModel::class.java)) {
          result.putParcelable("service_model", this.serviceModel as Parcelable?)
        } else if (Serializable::class.java.isAssignableFrom(ServiceModel::class.java)) {
          result.putSerializable("service_model", this.serviceModel as Serializable?)
        }
        return result
      }
  }

  public companion object {
    public fun actionPeriodicServicesFragmentToServiceDetailsFragment(serviceModel: ServiceModel? =
        null): NavDirections = ActionPeriodicServicesFragmentToServiceDetailsFragment(serviceModel)
  }
}
