package com.techfathers.mechanic_adda.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H&\u00a8\u0006\u0005"}, d2 = {"Lcom/techfathers/mechanic_adda/util/OnPositive;", "", "onNo", "", "onYes", "app_debug"})
public abstract interface OnPositive {
    
    public abstract void onYes();
    
    public abstract void onNo();
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
    public final class DefaultImpls {
        
        public static void onNo(@org.jetbrains.annotations.NotNull()
        com.techfathers.mechanic_adda.util.OnPositive $this) {
        }
    }
}