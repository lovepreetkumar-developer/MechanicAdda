// Generated by data binding compiler. Do not edit!
package com.techfathers.mechanic_adda.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.techfathers.mechanic_adda.R;
import com.techfathers.mechanic_adda.ui.base.BaseCallback;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ToolbarAuthBinding extends ViewDataBinding {
  @NonNull
  public final AppCompatImageView imgCross;

  @Bindable
  protected BaseCallback mCallback;

  protected ToolbarAuthBinding(Object _bindingComponent, View _root, int _localFieldCount,
      AppCompatImageView imgCross) {
    super(_bindingComponent, _root, _localFieldCount);
    this.imgCross = imgCross;
  }

  public abstract void setCallback(@Nullable BaseCallback callback);

  @Nullable
  public BaseCallback getCallback() {
    return mCallback;
  }

  @NonNull
  public static ToolbarAuthBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.toolbar_auth, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ToolbarAuthBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ToolbarAuthBinding>inflateInternal(inflater, R.layout.toolbar_auth, root, attachToRoot, component);
  }

  @NonNull
  public static ToolbarAuthBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.toolbar_auth, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ToolbarAuthBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ToolbarAuthBinding>inflateInternal(inflater, R.layout.toolbar_auth, null, false, component);
  }

  public static ToolbarAuthBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ToolbarAuthBinding bind(@NonNull View view, @Nullable Object component) {
    return (ToolbarAuthBinding)bind(component, view, R.layout.toolbar_auth);
  }
}
