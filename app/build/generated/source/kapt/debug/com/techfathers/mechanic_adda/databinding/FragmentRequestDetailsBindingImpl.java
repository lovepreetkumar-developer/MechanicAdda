package com.techfathers.mechanic_adda.databinding;
import com.techfathers.mechanic_adda.R;
import com.techfathers.mechanic_adda.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentRequestDetailsBindingImpl extends FragmentRequestDetailsBinding implements com.techfathers.mechanic_adda.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(15);
        sIncludes.setIncludes(0, 
            new String[] {"toolbar_child"},
            new int[] {7},
            new int[] {com.techfathers.mechanic_adda.R.layout.toolbar_child});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.view_center, 8);
        sViewsWithIds.put(R.id.rl_view_lottie, 9);
        sViewsWithIds.put(R.id.lottie_animation, 10);
        sViewsWithIds.put(R.id.tv_message, 11);
        sViewsWithIds.put(R.id.rl_whole_view, 12);
        sViewsWithIds.put(R.id.view, 13);
        sViewsWithIds.put(R.id.tv_booking_type, 14);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback21;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentRequestDetailsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 15, sIncludes, sViewsWithIds));
    }
    private FragmentRequestDetailsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (com.airbnb.lottie.LottieAnimationView) bindings[10]
            , (android.widget.RelativeLayout) bindings[9]
            , (android.widget.RelativeLayout) bindings[12]
            , (com.techfathers.mechanic_adda.databinding.ToolbarChildBinding) bindings[7]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[14]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[5]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[2]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[1]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[4]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[6]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[11]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[3]
            , (android.view.View) bindings[13]
            , (android.view.View) bindings[8]
            );
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        setContainedBinding(this.toolbar);
        this.tvComments.setTag(null);
        this.tvEmail.setTag(null);
        this.tvFullName.setTag(null);
        this.tvLocation.setTag(null);
        this.tvMark.setTag(null);
        this.tvMobileNo.setTag(null);
        setRootTag(root);
        // listeners
        mCallback21 = new com.techfathers.mechanic_adda.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
        }
        toolbar.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (toolbar.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.model == variableId) {
            setModel((com.techfathers.mechanic_adda.models.RequestModel) variable);
        }
        else if (BR.callback == variableId) {
            setCallback((com.techfathers.mechanic_adda.ui.base.BaseCallback) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setModel(@Nullable com.techfathers.mechanic_adda.models.RequestModel Model) {
        this.mModel = Model;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.model);
        super.requestRebind();
    }
    public void setCallback(@Nullable com.techfathers.mechanic_adda.ui.base.BaseCallback Callback) {
        this.mCallback = Callback;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.callback);
        super.requestRebind();
    }

    @Override
    public void setLifecycleOwner(@Nullable androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        toolbar.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeToolbar((com.techfathers.mechanic_adda.databinding.ToolbarChildBinding) object, fieldId);
        }
        return false;
    }
    private boolean onChangeToolbar(com.techfathers.mechanic_adda.databinding.ToolbarChildBinding Toolbar, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        com.techfathers.mechanic_adda.models.RequestModel model = mModel;
        java.lang.String modelFullName = null;
        java.lang.String modelLocation = null;
        java.lang.String modelMobileNo = null;
        java.lang.String modelComments = null;
        com.techfathers.mechanic_adda.ui.base.BaseCallback callback = mCallback;
        java.lang.String modelEmail = null;

        if ((dirtyFlags & 0xaL) != 0) {



                if (model != null) {
                    // read model.full_name
                    modelFullName = model.getFull_name();
                    // read model.location
                    modelLocation = model.getLocation();
                    // read model.mobile_no
                    modelMobileNo = model.getMobile_no();
                    // read model.comments
                    modelComments = model.getComments();
                    // read model.email
                    modelEmail = model.getEmail();
                }
        }
        if ((dirtyFlags & 0xcL) != 0) {
        }
        // batch finished
        if ((dirtyFlags & 0xcL) != 0) {
            // api target 1

            this.toolbar.setCallback(callback);
        }
        if ((dirtyFlags & 0xaL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvComments, modelComments);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvEmail, modelEmail);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvFullName, modelFullName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvLocation, modelLocation);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvMobileNo, modelMobileNo);
        }
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            this.tvMark.setOnClickListener(mCallback21);
        }
        executeBindingsOn(toolbar);
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // callback
        com.techfathers.mechanic_adda.ui.base.BaseCallback callback = mCallback;
        // callback != null
        boolean callbackJavaLangObjectNull = false;



        callbackJavaLangObjectNull = (callback) != (null);
        if (callbackJavaLangObjectNull) {



            callback.onClick(callbackArg_0);
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): toolbar
        flag 1 (0x2L): model
        flag 2 (0x3L): callback
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}