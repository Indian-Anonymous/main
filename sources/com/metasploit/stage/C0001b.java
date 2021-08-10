package com.metasploit.stage;

import java.io.UnsupportedEncodingException;
import java.util.concurrent.TimeUnit;

/* renamed from: com.metasploit.stage.b */
public final class C0001b {

    /* renamed from: a */
    private static final long f12a = TimeUnit.SECONDS.toMillis(1);

    /* renamed from: a */
    private static int m5a(byte[] bArr, int i) {
        int i2 = 0;
        for (int i3 = 0; i3 < 4; i3++) {
            i2 |= (bArr[i3 + i] & 255) << (i3 << 3);
        }
        return i2;
    }

    /* renamed from: a */
    public static C0000a m6a(byte[] bArr) {
        C0000a aVar = new C0000a();
        aVar.f8a = m5a(bArr, 0);
        aVar.f9b = f12a * ((long) m5a(bArr, 12));
        m8b(bArr, 16, 16);
        m8b(bArr, 32, 16);
        int i = 48;
        if ((aVar.f8a & 1) != 0) {
            aVar.f10c = m7a(bArr, 8000, 100);
        }
        while (bArr[i] != 0) {
            C0006g gVar = new C0006g();
            gVar.f16a = m7a(bArr, i, 512);
            int i2 = i + 512 + 4;
            gVar.f17b = f12a * ((long) m5a(bArr, i2));
            int i3 = i2 + 4;
            gVar.f18c = f12a * ((long) m5a(bArr, i3));
            i = i3 + 4;
            if (gVar.f16a.startsWith("http")) {
                m7a(bArr, i, 128);
                int i4 = i + 128;
                m7a(bArr, i4, 64);
                int i5 = i4 + 64;
                m7a(bArr, i5, 64);
                int i6 = i5 + 64;
                gVar.f19d = m7a(bArr, i6, 256);
                int i7 = i6 + 256;
                gVar.f20e = null;
                byte[] b = m8b(bArr, i7, 20);
                int i8 = i7 + 20;
                int i9 = 0;
                while (true) {
                    if (i9 >= b.length) {
                        break;
                    } else if (b[i9] != 0) {
                        gVar.f20e = b;
                        break;
                    } else {
                        i9++;
                    }
                }
                StringBuilder sb = new StringBuilder();
                int length = bArr.length;
                for (int i10 = i8; i10 < length; i10++) {
                    byte b2 = bArr[i10];
                    if (b2 == 0) {
                        break;
                    }
                    sb.append((char) (b2 & 255));
                }
                String sb2 = sb.toString();
                gVar.f21f = sb2;
                i = sb2.length() + i8;
            }
            aVar.f11d.add(gVar);
        }
        return aVar;
    }

    /* renamed from: a */
    private static String m7a(byte[] bArr, int i, int i2) {
        byte[] b = m8b(bArr, i, i2);
        try {
            return new String(b, "ISO-8859-1").trim();
        } catch (UnsupportedEncodingException e) {
            return new String(b).trim();
        }
    }

    /* renamed from: b */
    private static byte[] m8b(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return bArr2;
    }
}
