// Generated by data binding compiler. Do not edit!
package com.techfathers.mechanic_adda.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.techfathers.mechanic_adda.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ItemServiceDetailSlideBinding extends ViewDataBinding {
  @NonNull
  public final AppCompatImageView imgViewLogo;

  protected ItemServiceDetailSlideBinding(Object _bindingComponent, View _root,
      int _localFieldCount, AppCompatImageView imgViewLogo) {
    super(_bindingComponent, _root, _localFieldCount);
    this.imgViewLogo = imgViewLogo;
  }

  @NonNull
  public static ItemServiceDetailSlideBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_service_detail_slide, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ItemServiceDetailSlideBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ItemServiceDetailSlideBinding>inflateInternal(inflater, R.layout.item_service_detail_slide, root, attachToRoot, component);
  }

  @NonNull
  public static ItemServiceDetailSlideBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_service_detail_slide, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ItemServiceDetailSlideBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ItemServiceDetailSlideBinding>inflateInternal(inflater, R.layout.item_service_detail_slide, null, false, component);
  }

  public static ItemServiceDetailSlideBinding bind(@NonNull View view) {
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
  public static ItemServiceDetailSlideBinding bind(@NonNull View view, @Nullable Object component) {
    return (ItemServiceDetailSlideBinding)bind(component, view, R.layout.item_service_detail_slide);
  }
}
