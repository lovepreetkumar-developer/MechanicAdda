package com.techfathers.mechanic_adda.databinding;
import com.techfathers.mechanic_adda.R;
import com.techfathers.mechanic_adda.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemPeriodicServiceBindingImpl extends ItemPeriodicServiceBinding implements com.techfathers.mechanic_adda.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.img_service, 4);
    }
    // views
    @NonNull
    private final com.google.android.material.card.MaterialCardView mboundView0;
    @NonNull
    private final androidx.appcompat.widget.AppCompatTextView mboundView1;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback12;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemPeriodicServiceBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private ItemPeriodicServiceBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.google.android.material.card.MaterialCardView) bindings[4]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[2]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[3]
            );
        this.mboundView0 = (com.google.android.material.card.MaterialCardView) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (androidx.appcompat.widget.AppCompatTextView) bindings[1];
        this.mboundView1.setTag(null);
        this.tvDPrice.setTag(null);
        this.tvPrice.setTag(null);
        setRootTag(root);
        // listeners
        mCallback12 = new com.techfathers.mechanic_adda.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
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
        if (BR.model == variableId) {
            setModel((com.techfathers.mechanic_adda.models.ServiceModel) variable);
        }
        else if (BR.pos == variableId) {
            setPos((java.lang.Integer) variable);
        }
        else if (BR.callback == variableId) {
            setCallback((com.techfathers.mechanic_adda.ui.base.BaseItem.OnItemClickListener) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setModel(@Nullable com.techfathers.mechanic_adda.models.ServiceModel Model) {
        this.mModel = Model;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.model);
        super.requestRebind();
    }
    public void setPos(@Nullable java.lang.Integer Pos) {
        this.mPos = Pos;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.pos);
        super.requestRebind();
    }
    public void setCallback(@Nullable com.techfathers.mechanic_adda.ui.base.BaseItem.OnItemClickListener Callback) {
        this.mCallback = Callback;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
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
        com.techfathers.mechanic_adda.models.ServiceModel model = mModel;
        java.lang.Integer pos = mPos;
        java.lang.String modelPrice = null;
        java.lang.String modelDPrice = null;
        java.lang.String modelTitle = null;
        com.techfathers.mechanic_adda.ui.base.BaseItem.OnItemClickListener<?> callback = mCallback;

        if ((dirtyFlags & 0x9L) != 0) {



                if (model != null) {
                    // read model.price
                    modelPrice = model.getPrice();
                    // read model.d_price
                    modelDPrice = model.getD_price();
                    // read model.title
                    modelTitle = model.getTitle();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            this.mboundView0.setOnClickListener(mCallback12);
            com.techfathers.mechanic_adda.util.BindingUtils.setStrikeThroughTextFlag(this.tvPrice, (java.lang.String) null);
        }
        if ((dirtyFlags & 0x9L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, modelTitle);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvDPrice, modelDPrice);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvPrice, modelPrice);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // model
        com.techfathers.mechanic_adda.models.ServiceModel model = mModel;
        // pos
        java.lang.Integer pos = mPos;
        // callback
        com.techfathers.mechanic_adda.ui.base.BaseItem.OnItemClickListener callback = mCallback;
        // callback != null
        boolean callbackJavaLangObjectNull = false;



        callbackJavaLangObjectNull = (callback) != (null);
        if (callbackJavaLangObjectNull) {





            callback.onItemClick(callbackArg_0, model, pos);
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): model
        flag 1 (0x2L): pos
        flag 2 (0x3L): callback
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}