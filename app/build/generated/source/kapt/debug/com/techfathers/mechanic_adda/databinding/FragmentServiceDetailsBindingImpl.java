package com.techfathers.mechanic_adda.databinding;
import com.techfathers.mechanic_adda.R;
import com.techfathers.mechanic_adda.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentServiceDetailsBindingImpl extends FragmentServiceDetailsBinding implements com.techfathers.mechanic_adda.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(12);
        sIncludes.setIncludes(0, 
            new String[] {"toolbar_child"},
            new int[] {5},
            new int[] {com.techfathers.mechanic_adda.R.layout.toolbar_child});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.vpSlides, 6);
        sViewsWithIds.put(R.id.tab_layout_dots, 7);
        sViewsWithIds.put(R.id.img_tick_mark_1, 8);
        sViewsWithIds.put(R.id.img_tick_mark_2, 9);
        sViewsWithIds.put(R.id.img_tick_mark_3, 10);
        sViewsWithIds.put(R.id.img_tick_mark_4, 11);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    @NonNull
    private final androidx.appcompat.widget.AppCompatTextView mboundView1;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback10;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentServiceDetailsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 12, sIncludes, sViewsWithIds));
    }
    private FragmentServiceDetailsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.appcompat.widget.AppCompatImageView) bindings[8]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[9]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[10]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[11]
            , (com.google.android.material.tabs.TabLayout) bindings[7]
            , (com.techfathers.mechanic_adda.databinding.ToolbarChildBinding) bindings[5]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[4]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[2]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[3]
            , (androidx.viewpager.widget.ViewPager) bindings[6]
            );
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (androidx.appcompat.widget.AppCompatTextView) bindings[1];
        this.mboundView1.setTag(null);
        setContainedBinding(this.toolbar);
        this.tvConsult.setTag(null);
        this.tvDPrice.setTag(null);
        this.tvPrice.setTag(null);
        setRootTag(root);
        // listeners
        mCallback10 = new com.techfathers.mechanic_adda.generated.callback.OnClickListener(this, 1);
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
        java.lang.String modelPrice = null;
        java.lang.String modelTitle = null;
        java.lang.String modelDPrice = null;
        com.techfathers.mechanic_adda.ui.base.BaseCallback callback = mCallback;

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

            this.tvConsult.setOnClickListener(mCallback10);
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