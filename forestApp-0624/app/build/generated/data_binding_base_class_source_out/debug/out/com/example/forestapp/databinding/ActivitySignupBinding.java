// Generated by data binding compiler. Do not edit!
package com.example.forestapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.forestapp.R;
import com.example.forestapp.SignupViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivitySignupBinding extends ViewDataBinding {
  @NonNull
  public final EditText editText;

  @NonNull
  public final ImageView imageView1;

  @NonNull
  public final TextView signupAge;

  @NonNull
  public final TextView signupId;

  @NonNull
  public final TextView signupName;

  @NonNull
  public final TextView signupPwd;

  @NonNull
  public final TextView signupSex;

  @Bindable
  protected SignupViewModel mModel;

  protected ActivitySignupBinding(Object _bindingComponent, View _root, int _localFieldCount,
      EditText editText, ImageView imageView1, TextView signupAge, TextView signupId,
      TextView signupName, TextView signupPwd, TextView signupSex) {
    super(_bindingComponent, _root, _localFieldCount);
    this.editText = editText;
    this.imageView1 = imageView1;
    this.signupAge = signupAge;
    this.signupId = signupId;
    this.signupName = signupName;
    this.signupPwd = signupPwd;
    this.signupSex = signupSex;
  }

  public abstract void setModel(@Nullable SignupViewModel model);

  @Nullable
  public SignupViewModel getModel() {
    return mModel;
  }

  @NonNull
  public static ActivitySignupBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_signup, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivitySignupBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivitySignupBinding>inflateInternal(inflater, R.layout.activity_signup, root, attachToRoot, component);
  }

  @NonNull
  public static ActivitySignupBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_signup, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivitySignupBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivitySignupBinding>inflateInternal(inflater, R.layout.activity_signup, null, false, component);
  }

  public static ActivitySignupBinding bind(@NonNull View view) {
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
  public static ActivitySignupBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivitySignupBinding)bind(component, view, R.layout.activity_signup);
  }
}
