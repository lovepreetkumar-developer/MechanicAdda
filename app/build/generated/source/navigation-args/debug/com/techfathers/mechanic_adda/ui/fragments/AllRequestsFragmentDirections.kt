package com.techfathers.mechanic_adda.ui.fragments

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavDirections
import com.techfathers.mechanic_adda.R
import com.techfathers.mechanic_adda.models.RequestModel
import java.io.Serializable
import java.lang.UnsupportedOperationException
import kotlin.Int
import kotlin.Suppress

public class AllRequestsFragmentDirections private constructor() {
  private data class ActionAllRequestsFragmentToRequestDetailsFragment(
    public val requestModel: RequestModel
  ) : NavDirections {
    public override val actionId: Int =
        R.id.action_all_requests_fragment_to_request_details_fragment

    public override val arguments: Bundle
      @Suppress("CAST_NEVER_SUCCEEDS")
      get() {
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
  }

  public companion object {
    public fun actionAllRequestsFragmentToRequestDetailsFragment(requestModel: RequestModel):
        NavDirections = ActionAllRequestsFragmentToRequestDetailsFragment(requestModel)
  }
}
