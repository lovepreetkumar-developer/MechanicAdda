package com.techfathers.mechanic_adda.ui.fragments

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.techfathers.mechanic_adda.R

public class SplashFragmentDirections private constructor() {
  public companion object {
    public fun actionSplashFragmentToIntroFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_splash_fragment_to_intro_fragment)
  }
}
