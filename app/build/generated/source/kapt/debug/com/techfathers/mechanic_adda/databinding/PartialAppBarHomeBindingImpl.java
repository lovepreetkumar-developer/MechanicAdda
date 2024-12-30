package com.techfathers.mechanic_adda.databinding;
import com.techfathers.mechanic_adda.R;
import com.techfathers.mechanic_adda.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class PartialAppBarHomeBindingImpl extends PartialAppBarHomeBinding implements com.techfathers.mechanic_adda.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.toolbar, 5);
        sViewsWithIds.put(R.id.img_car_logo, 6);
        sViewsWithIds.put(R.id.rl_location, 7);
        sViewsWithIds.put(R.id.img_plane, 8);
        sViewsWithIds.put(R.id.ll_honeymoon_packages, 9);
        sViewsWithIds.put(R.id.rv_workshops, 10);
    }
    // views
    @NonNull
    private final androidx.appcompat.widget.LinearLayoutCompat mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback5;
    @Nullable
    private final android.view.View.OnClickListener mCallback6;
    @Nullable
    private final android.view.View.OnClickListener mCallback3;
    @Nullable
    private final android.view.View.OnClickListener mCallback4;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public PartialAppBarHomeBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 11, sIncludes, sViewsWithIds));
    }
    private PartialAppBarHomeBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.appcompat.widget.AppCompatImageView) bindings[6]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[1]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[8]
            , (androidx.appcompat.widget.LinearLayoutCompat) bindings[3]
            , (androidx.appcompat.widget.LinearLayoutCompat) bindings[4]
            , (androidx.appcompat.widget.LinearLayoutCompat) bindings[9]
            , (androidx.appcompat.widget.LinearLayoutCompat) bindings[2]
            , (android.widget.RelativeLayout) bindings[7]
            , (androidx.recyclerview.widget.RecyclerView) bindings[10]
            , (android.widget.RelativeLayout) bindings[5]
            );
        this.imgMenu.setTag(null);
        this.llCustomServices.setTag(null);
        this.llHireMechanic.setTag(null);
        this.llPeriodicServices.setTag(null);
        this.mboundView0 = (androidx.appcompat.widget.LinearLayoutCompat) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        mCallback5 = new com.techfathers.mechanic_adda.generated.callback.OnClickListener(this, 3);
        mCallback6 = new com.techfathers.mechanic_adda.generated.callback.OnClickListener(this, 4);
        mCallback3 = new com.techfathers.mechanic_adda.generated.callback.OnClickListener(this, 1);
        mCallback4 = new com.techfathers.mechanic_adda.generated.callback.OnClickListener(this, 2);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.callback == variableId) {
            setCallback((com.techfathers.mechanic_adda.ui.base.BaseCallback) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setCallback(@Nullable com.techfathers.mechanic_adda.ui.base.BaseCallback Callback) {
        this.mCallback = Callback;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.callback);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
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
        com.techfathers.mechanic_adda.ui.base.BaseCallback callback = mCallback;
        // batch finished
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            this.imgMenu.setOnClickListener(mCallback3);
            this.llCustomServices.setOnClickListener(mCallback5);
            this.llHireMechanic.setOnClickListener(mCallback6);
            this.llPeriodicServices.setOnClickListener(mCallback4);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 3: {
                // localize variables for thread safety
                // callback
                com.techfathers.mechanic_adda.ui.base.BaseCallback callback = mCallback;
                // callback != null
                boolean callbackJavaLangObjectNull = false;



                callbackJavaLangObjectNull = (callback) != (null);
                if (callbackJavaLangObjectNull) {



                    callback.onClick(callbackArg_0);
                }
                break;
            }
            case 4: {
                // localize variables for thread safety
                // callback
                com.techfathers.mechanic_adda.ui.base.BaseCallback callback = mCallback;
                // callback != null
                boolean callbackJavaLangObjectNull = false;



                callbackJavaLangObjectNull = (callback) != (null);
                if (callbackJavaLangObjectNull) {



                    callback.onClick(callbackArg_0);
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // callback
                com.techfathers.mechanic_adda.ui.base.BaseCallback callback = mCallback;
                // callback != null
                boolean callbackJavaLangObjectNull = false;



                callbackJavaLangObjectNull = (callback) != (null);
                if (callbackJavaLangObjectNull) {



                    callback.onClick(callbackArg_0);
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // callback
                com.techfathers.mechanic_adda.ui.base.BaseCallback callback = mCallback;
                // callback != null
                boolean callbackJavaLangObjectNull = false;



                callbackJavaLangObjectNull = (callback) != (null);
                if (callbackJavaLangObjectNull) {



                    callback.onClick(callbackArg_0);
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): callback
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}