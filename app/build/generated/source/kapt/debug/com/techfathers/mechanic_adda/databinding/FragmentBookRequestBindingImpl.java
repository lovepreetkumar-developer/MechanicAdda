package com.techfathers.mechanic_adda.databinding;
import com.techfathers.mechanic_adda.R;
import com.techfathers.mechanic_adda.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentBookRequestBindingImpl extends FragmentBookRequestBinding implements com.techfathers.mechanic_adda.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(18);
        sIncludes.setIncludes(0, 
            new String[] {"toolbar_child"},
            new int[] {5},
            new int[] {com.techfathers.mechanic_adda.R.layout.toolbar_child});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.view_center, 6);
        sViewsWithIds.put(R.id.rl_view_lottie, 7);
        sViewsWithIds.put(R.id.lottie_animation, 8);
        sViewsWithIds.put(R.id.tv_message, 9);
        sViewsWithIds.put(R.id.rl_whole_view, 10);
        sViewsWithIds.put(R.id.img_service, 11);
        sViewsWithIds.put(R.id.et_full_name, 12);
        sViewsWithIds.put(R.id.et_email, 13);
        sViewsWithIds.put(R.id.et_mobile_no, 14);
        sViewsWithIds.put(R.id.et_location, 15);
        sViewsWithIds.put(R.id.et_comments, 16);
        sViewsWithIds.put(R.id.tv_payment, 17);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    @NonNull
    private final androidx.appcompat.widget.AppCompatTextView mboundView1;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback11;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentBookRequestBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 18, sIncludes, sViewsWithIds));
    }
    private FragmentBookRequestBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.appcompat.widget.AppCompatEditText) bindings[16]
            , (androidx.appcompat.widget.AppCompatEditText) bindings[13]
            , (androidx.appcompat.widget.AppCompatEditText) bindings[12]
            , (androidx.appcompat.widget.AppCompatEditText) bindings[15]
            , (androidx.appcompat.widget.AppCompatEditText) bindings[14]
            , (com.google.android.material.card.MaterialCardView) bindings[11]
            , (com.airbnb.lottie.LottieAnimationView) bindings[8]
            , (android.widget.RelativeLayout) bindings[7]
            , (android.widget.RelativeLayout) bindings[10]
            , (com.techfathers.mechanic_adda.databinding.ToolbarChildBinding) bindings[5]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[4]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[2]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[9]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[17]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[3]
            , (android.view.View) bindings[6]
            );
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (androidx.appcompat.widget.AppCompatTextView) bindings[1];
        this.mboundView1.setTag(null);
        setContainedBinding(this.toolbar);
        this.tvAction.setTag(null);
        this.tvDPrice.setTag(null);
        this.tvPrice.setTag(null);
        setRootTag(root);
        // listeners
        mCallback11 = new com.techfathers.mechanic_adda.generated.callback.OnClickListener(this, 1);
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
            setModel((com.techfathers.mechanic_adda.models.ServiceModel) variable);
        }
        else if (BR.callback == variableId) {
            setCallback((com.techfathers.mechanic_adda.ui.base.BaseCallback) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setModel(@Nullable com.techfathers.mechanic_adda.models.ServiceModel Model) {
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
        com.techfathers.mechanic_adda.models.ServiceModel model = mModel;
        com.techfathers.mechanic_adda.ui.base.BaseCallback callback = mCallback;
        java.lang.String modelPrice = null;
        java.lang.String modelTitle = null;
        java.lang.String modelDPrice = null;

        if ((dirtyFlags & 0xaL) != 0) {



                if (model != null) {
                    // read model.price
                    modelPrice = model.getPrice();
                    // read model.title
                    modelTitle = model.getTitle();
                    // read model.d_price
                    modelDPrice = model.getD_price();
                }
        }
        if ((dirtyFlags & 0xcL) != 0) {
        }
        // batch finished
        if ((dirtyFlags & 0xaL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, modelTitle);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvDPrice, modelDPrice);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvPrice, modelPrice);
        }
        if ((dirtyFlags & 0xcL) != 0) {
            // api target 1

            this.toolbar.setCallback(callback);
        }
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            this.tvAction.setOnClickListener(mCallback11);
            com.techfathers.mechanic_adda.util.BindingUtils.setStrikeThroughTextFlag(this.tvPrice, (java.lang.String) null);
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