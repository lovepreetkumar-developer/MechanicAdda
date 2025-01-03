// Generated by data binding compiler. Do not edit!
package com.techfathers.mechanic_adda.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.techfathers.mechanic_adda.R;
import com.techfathers.mechanic_adda.models.ServiceModel;
import com.techfathers.mechanic_adda.ui.base.BaseCallback;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentServiceDetailsBinding extends ViewDataBinding {
  @NonNull
  public final AppCompatImageView imgTickMark1;

  @NonNull
  public final AppCompatImageView imgTickMark2;

  @NonNull
  public final AppCompatImageView imgTickMark3;

  @NonNull
  public final AppCompatImageView imgTickMark4;

  @NonNull
  public final TabLayout tabLayoutDots;

  @NonNull
  public final ToolbarChildBinding toolbar;

  @NonNull
  public final AppCompatTextView tvConsult;

  @NonNull
  public final AppCompatTextView tvDPrice;

  @NonNull
  public final AppCompatTextView tvPrice;

  @NonNull
  public final ViewPager vpSlides;

  @Bindable
  protected BaseCallback mCallback;

  @Bindable
  protected ServiceModel mModel;

  protected FragmentServiceDetailsBinding(Object _bindingComponent, View _root,
      int _localFieldCount, AppCompatImageView imgTickMark1, AppCompatImageView imgTickMark2,
      AppCompatImageView imgTickMark3, AppCompatImageView imgTickMark4, TabLayout tabLayoutDots,
      ToolbarChildBinding toolbar, AppCompatTextView tvConsult, AppCompatTextView tvDPrice,
      AppCompatTextView tvPrice, ViewPager vpSlides) {
    super(_bindingComponent, _root, _localFieldCount);
    this.imgTickMark1 = imgTickMark1;
    this.imgTickMark2 = imgTickMark2;
    this.imgTickMark3 = imgTickMark3;
    this.imgTickMark4 = imgTickMark4;
    this.tabLayoutDots = tabLayoutDots;
    this.toolbar = toolbar;
    this.tvConsult = tvConsult;
    this.tvDPrice = tvDPrice;
    this.tvPrice = tvPrice;
    this.vpSlides = vpSlides;
  }

  public abstract void setCallback(@Nullable BaseCallback callback);

  @Nullable
  public BaseCallback getCallback() {
    return mCallback;
  }

  public abstract void setModel(@Nullable ServiceModel model);

  @Nullable
  public ServiceModel getModel() {
    return mModel;
  }

  @NonNull
  public static FragmentServiceDetailsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_service_details, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentServiceDetailsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentServiceDetailsBinding>inflateInternal(inflater, R.layout.fragment_service_details, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentServiceDetailsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_service_details, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentServiceDetailsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentServiceDetailsBinding>inflateInternal(inflater, R.layout.fragment_service_details, null, false, component);
  }

  public static FragmentServiceDetailsBinding bind(@NonNull View view) {
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
  public static FragmentServiceDetailsBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentServiceDetailsBinding)bind(component, view, R.layout.fragment_service_details);
  }
}
