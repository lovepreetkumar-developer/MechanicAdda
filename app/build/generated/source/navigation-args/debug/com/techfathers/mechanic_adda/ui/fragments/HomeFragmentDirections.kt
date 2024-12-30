package com.techfathers.mechanic_adda.ui.fragments

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.techfathers.mechanic_adda.R
import com.techfathers.mechanic_adda.models.ServiceModel
import java.io.Serializable
import kotlin.Int
import kotlin.String
import kotlin.Suppress

public class HomeFragmentDirections private constructor() {
  private data class ActionHomeFragmentToBookRequestFragment(
    public val requestType: String = "",
    public val serviceModel: ServiceModel? = null
  ) : NavDirections {
    public override val actionId: Int = R.id.action_home_fragment_to_book_request_fragment

    public override val arguments: Bundle
      @Suppress("CAST_NEVER_SUCCEEDS")
      get() {
        val result = Bundle()
        result.putString("request_type", this.requestType)
        if (Parcelable::class.java.isAssignableFrom(ServiceModel::class.java)) {
          result.putParcelable("service_model", this.serviceModel as Parcelable?)
        } else if (Serializable::class.java.isAssignableFrom(ServiceModel::class.java)) {
          result.putSerializable("service_model", this.serviceModel as Serializable?)
        }
        return result
      }
  }

  public companion object {
    public fun actionHomeFragmentToPeriodicServicesFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_home_fragment_to_periodic_services_fragment)

    public fun actionHomeFragmentToBookRequestFragment(requestType: String = "",
        serviceModel: ServiceModel? = null): NavDirections =
        ActionHomeFragmentToBookRequestFragment(requestType, serviceModel)

    public fun actionHomeFragmentToLoginFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_home_fragment_to_login_fragment)
  }
}
