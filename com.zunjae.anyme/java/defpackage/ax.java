package defpackage;

import java.util.ArrayList;

final class ax {
    static void a(bh bhVar, ao aoVar, int i) {
        int i2;
        ay[] ayVarArr;
        int i3;
        bh bhVar2 = bhVar;
        ao aoVar2 = aoVar;
        int i4 = i;
        if (i4 == 0) {
            i2 = bhVar2.ah;
            ayVarArr = bhVar2.ak;
            i3 = 0;
        } else {
            i2 = bhVar2.ai;
            ayVarArr = bhVar2.aj;
            i3 = 2;
        }
        int i5 = 0;
        while (i5 < i2) {
            int i6;
            int i7;
            float f;
            Object obj;
            Object obj2;
            Object obj3;
            be beVar;
            int i8;
            Object obj4;
            be beVar2;
            be beVar3;
            au auVar;
            Object obj5;
            int i9;
            be beVar4;
            int i10;
            be beVar5;
            be beVar6;
            be beVar7;
            int i11;
            au auVar2;
            az azVar;
            au auVar3;
            int i12;
            au auVar4;
            az azVar2;
            az azVar3;
            ay ayVar = ayVarArr[i5];
            ayVar.a();
            if (bhVar2.s(4)) {
                if (bl.a(aoVar2, i4, i3, ayVar)) {
                    i6 = i5;
                    i7 = i2;
                    i5 = i6 + 1;
                    i2 = i7;
                    bhVar2 = bhVar;
                }
            }
            be beVar8 = ayVar.a;
            be beVar9 = ayVar.c;
            be beVar10 = ayVar.b;
            be beVar11 = ayVar.d;
            be beVar12 = ayVar.e;
            float f2 = ayVar.k;
            Object obj6 = bhVar2.B[i4] == bg.b ? 1 : null;
            if (i4 == 0) {
                if (beVar12.T == 0) {
                    f = f2;
                    obj = 1;
                } else {
                    f = f2;
                    obj = null;
                }
                obj2 = beVar12.T == 1 ? 1 : null;
                obj3 = beVar12.T == 2 ? 1 : null;
                beVar = beVar8;
                i8 = i5;
                obj4 = obj;
                i7 = i2;
            } else {
                f = f2;
                obj = beVar12.U == 0 ? 1 : null;
                Object obj7 = beVar12.U == 1 ? 1 : null;
                i8 = i5;
                obj3 = beVar12.U == 2 ? 1 : null;
                obj2 = obj7;
                beVar = beVar8;
                obj4 = obj;
                i7 = i2;
            }
            obj = null;
            while (true) {
                be beVar13 = null;
                if (obj != null) {
                    break;
                }
                int i13;
                int d;
                az azVar4;
                Object obj8;
                int i14;
                az azVar5;
                au auVar5;
                int i15;
                az[] azVarArr;
                az azVar6 = beVar.z[i3];
                if (obj6 == null) {
                    if (obj3 == null) {
                        i13 = 4;
                        d = azVar6.d();
                        azVar4 = azVar6.c;
                        if (!(azVar4 == null || beVar == beVar8)) {
                            d += azVar4.d();
                        }
                        i2 = d;
                        if (obj3 == null && beVar != beVar8 && beVar != beVar10) {
                            beVar2 = beVar12;
                            obj8 = obj;
                            i14 = 6;
                        } else if (obj4 != null || obj6 == null) {
                            beVar2 = beVar12;
                            obj8 = obj;
                            i14 = i13;
                        } else {
                            beVar2 = beVar12;
                            obj8 = obj;
                            i14 = 4;
                        }
                        azVar5 = azVar6.c;
                        if (azVar5 == null) {
                            if (beVar != beVar10) {
                                beVar3 = beVar8;
                                auVar = azVar6.f;
                                auVar5 = azVar5.f;
                                obj5 = obj3;
                                i15 = 5;
                            } else {
                                beVar3 = beVar8;
                                obj5 = obj3;
                                auVar = azVar6.f;
                                auVar5 = azVar5.f;
                                i15 = 6;
                            }
                            aoVar2.a(auVar, auVar5, i2, i15);
                            aoVar2.c(azVar6.f, azVar6.c.f, i2, i14);
                        } else {
                            beVar3 = beVar8;
                            obj5 = obj3;
                        }
                        if (obj6 != null) {
                            if (beVar.j() == 8 && beVar.B[i4] == bg.c) {
                                az[] azVarArr2 = beVar.z;
                                i5 = 0;
                                aoVar2.a(azVarArr2[i3 + 1].f, azVarArr2[i3].f, 0, 5);
                            } else {
                                i5 = 0;
                            }
                            aoVar2.a(beVar.z[i3].f, bhVar2.z[i3].f, i5, 6);
                        }
                        azVar5 = beVar.z[i3 + 1].c;
                        if (azVar5 != null) {
                            beVar12 = azVar5.a;
                            azVarArr = beVar12.z;
                            if (azVarArr[i3].c != null) {
                                if (azVarArr[i3].c.a != beVar) {
                                    beVar13 = beVar12;
                                }
                            }
                        }
                        if (beVar13 == null) {
                            beVar = beVar13;
                            obj = obj8;
                            beVar12 = beVar2;
                            beVar8 = beVar3;
                            obj3 = obj5;
                        } else {
                            beVar12 = beVar2;
                            beVar8 = beVar3;
                            obj3 = obj5;
                            obj = 1;
                        }
                    }
                }
                i13 = 1;
                d = azVar6.d();
                azVar4 = azVar6.c;
                d += azVar4.d();
                i2 = d;
                if (obj3 == null) {
                }
                if (obj4 != null) {
                }
                beVar2 = beVar12;
                obj8 = obj;
                i14 = i13;
                azVar5 = azVar6.c;
                if (azVar5 == null) {
                    beVar3 = beVar8;
                    obj5 = obj3;
                } else {
                    if (beVar != beVar10) {
                        beVar3 = beVar8;
                        obj5 = obj3;
                        auVar = azVar6.f;
                        auVar5 = azVar5.f;
                        i15 = 6;
                    } else {
                        beVar3 = beVar8;
                        auVar = azVar6.f;
                        auVar5 = azVar5.f;
                        obj5 = obj3;
                        i15 = 5;
                    }
                    aoVar2.a(auVar, auVar5, i2, i15);
                    aoVar2.c(azVar6.f, azVar6.c.f, i2, i14);
                }
                if (obj6 != null) {
                    if (beVar.j() == 8) {
                    }
                    i5 = 0;
                    aoVar2.a(beVar.z[i3].f, bhVar2.z[i3].f, i5, 6);
                }
                azVar5 = beVar.z[i3 + 1].c;
                if (azVar5 != null) {
                    beVar12 = azVar5.a;
                    azVarArr = beVar12.z;
                    if (azVarArr[i3].c != null) {
                        if (azVarArr[i3].c.a != beVar) {
                            beVar13 = beVar12;
                        }
                    }
                }
                if (beVar13 == null) {
                    beVar12 = beVar2;
                    beVar8 = beVar3;
                    obj3 = obj5;
                    obj = 1;
                } else {
                    beVar = beVar13;
                    obj = obj8;
                    beVar12 = beVar2;
                    beVar8 = beVar3;
                    obj3 = obj5;
                }
            }
            beVar2 = beVar12;
            beVar3 = beVar8;
            obj5 = obj3;
            if (beVar11 != null) {
                azVarArr2 = beVar9.z;
                i9 = i3 + 1;
                if (azVarArr2[i9].c != null) {
                    az azVar7 = beVar11.z[i9];
                    aoVar2.b(azVar7.f, azVarArr2[i9].c.f, -azVar7.d(), 5);
                }
            }
            if (obj6 != null) {
                i9 = i3 + 1;
                auVar5 = bhVar2.z[i9].f;
                azVarArr = beVar9.z;
                aoVar2.a(auVar5, azVarArr[i9].f, azVarArr[i9].d(), 6);
            }
            ArrayList arrayList = ayVar.h;
            if (arrayList != null) {
                i9 = arrayList.size();
                if (i9 > 1) {
                    if (ayVar.l && !ayVar.n) {
                        f = (float) ayVar.j;
                    }
                    float f3 = 0.0f;
                    beVar4 = null;
                    i10 = 0;
                    float f4 = 0.0f;
                    while (i10 < i9) {
                        float f5;
                        az[] azVarArr3;
                        ArrayList arrayList2;
                        beVar5 = (be) arrayList.get(i10);
                        float f6 = beVar5.X[i4];
                        if (f6 >= f3) {
                            f5 = 0.0f;
                        } else if (ayVar.n) {
                            azVarArr3 = beVar5.z;
                            aoVar2.c(azVarArr3[i3 + 1].f, azVarArr3[i3].f, 0, 4);
                            arrayList2 = arrayList;
                            i10++;
                            arrayList = arrayList2;
                            bhVar2 = bhVar;
                            f3 = 0.0f;
                        } else {
                            f5 = 0.0f;
                            f6 = 1.0f;
                        }
                        if (f6 == f5) {
                            azVarArr3 = beVar5.z;
                            aoVar2.c(azVarArr3[i3 + 1].f, azVarArr3[i3].f, 0, 6);
                            arrayList2 = arrayList;
                            i10++;
                            arrayList = arrayList2;
                            bhVar2 = bhVar;
                            f3 = 0.0f;
                        } else {
                            if (beVar4 != null) {
                                az[] azVarArr4 = beVar4.z;
                                au auVar6 = azVarArr4[i3].f;
                                int i16 = i3 + 1;
                                au auVar7 = azVarArr4[i16].f;
                                azVarArr = beVar5.z;
                                au auVar8 = azVarArr[i3].f;
                                auVar = azVarArr[i16].f;
                                arrayList2 = arrayList;
                                al c = aoVar.c();
                                c.a(f4, f, f6, auVar6, auVar7, auVar8, auVar);
                                aoVar2.a(c);
                            } else {
                                arrayList2 = arrayList;
                            }
                            beVar4 = beVar5;
                            f4 = f6;
                            i10++;
                            arrayList = arrayList2;
                            bhVar2 = bhVar;
                            f3 = 0.0f;
                        }
                    }
                }
            }
            be beVar14;
            be beVar15;
            if (beVar10 == null || (beVar10 != beVar11 && obj5 == null)) {
                beVar6 = beVar11;
                beVar7 = beVar10;
                beVar5 = beVar9;
                i6 = i8;
                beVar14 = beVar3;
                Object obj9;
                be beVar16;
                be beVar17;
                int i17;
                int d2;
                au auVar9;
                int d3;
                if (obj4 != null && beVar7 != null) {
                    i11 = ayVar.j;
                    obj9 = (i11 <= 0 || ayVar.i != i11) ? null : 1;
                    beVar16 = beVar7;
                    beVar4 = beVar16;
                    while (beVar4 != null) {
                        be beVar18;
                        be beVar19;
                        be beVar20;
                        beVar15 = beVar4.Z[i4];
                        if (beVar15 == null) {
                            if (beVar4 != beVar6) {
                                beVar17 = beVar15;
                                beVar18 = beVar4;
                                beVar16 = beVar18;
                                beVar4 = beVar17;
                            }
                        }
                        azVar5 = beVar4.z[i3];
                        auVar2 = azVar5.f;
                        azVar = azVar5.c;
                        auVar3 = azVar != null ? azVar.f : null;
                        if (beVar16 != beVar4) {
                            azVar = beVar16.z[i3 + 1];
                        } else {
                            if (beVar4 == beVar7 && beVar16 == beVar4) {
                                az[] azVarArr5 = beVar14.z;
                                if (azVarArr5[i3].c != null) {
                                    azVar = azVarArr5[i3].c;
                                } else {
                                    auVar3 = null;
                                }
                            }
                            i11 = azVar5.d();
                            i17 = i3 + 1;
                            d2 = beVar4.z[i17].d();
                            if (beVar15 == null) {
                                azVar7 = beVar15.z[i3];
                                beVar19 = beVar14;
                            } else {
                                beVar19 = beVar14;
                                azVar7 = beVar5.z[i17].c;
                                if (azVar7 != null) {
                                    beVar20 = beVar15;
                                    auVar6 = null;
                                    auVar9 = beVar4.z[i17].f;
                                    if (azVar7 != null) {
                                        d2 += azVar7.d();
                                    }
                                    if (beVar16 != null) {
                                        i11 += beVar16.z[i17].d();
                                    }
                                    if (auVar2 != null || auVar3 == null || auVar6 == null || auVar9 == null) {
                                        beVar18 = beVar4;
                                        beVar14 = beVar19;
                                        beVar17 = beVar20;
                                        beVar16 = beVar18;
                                        beVar4 = beVar17;
                                    } else {
                                        int d4 = beVar4 == beVar7 ? beVar7.z[i3].d() : i11;
                                        d3 = beVar4 == beVar6 ? beVar6.z[i17].d() : d2;
                                        auVar5 = auVar2;
                                        auVar2 = auVar3;
                                        i12 = d4;
                                        auVar4 = auVar6;
                                        beVar14 = beVar19;
                                        auVar = auVar9;
                                        beVar17 = beVar20;
                                        i10 = d3;
                                        beVar18 = beVar4;
                                        aoVar.a(auVar5, auVar2, i12, 0.5f, auVar4, auVar, i10, obj9 != null ? 6 : 4);
                                        beVar16 = beVar18;
                                        beVar4 = beVar17;
                                    }
                                }
                            }
                            auVar6 = azVar7.f;
                            beVar20 = beVar15;
                            auVar9 = beVar4.z[i17].f;
                            if (azVar7 != null) {
                                d2 += azVar7.d();
                            }
                            if (beVar16 != null) {
                                i11 += beVar16.z[i17].d();
                            }
                            if (auVar2 != null) {
                            }
                            beVar18 = beVar4;
                            beVar14 = beVar19;
                            beVar17 = beVar20;
                            beVar16 = beVar18;
                            beVar4 = beVar17;
                        }
                        auVar3 = azVar.f;
                        i11 = azVar5.d();
                        i17 = i3 + 1;
                        d2 = beVar4.z[i17].d();
                        if (beVar15 == null) {
                            beVar19 = beVar14;
                            azVar7 = beVar5.z[i17].c;
                            if (azVar7 != null) {
                                beVar20 = beVar15;
                                auVar6 = null;
                                auVar9 = beVar4.z[i17].f;
                                if (azVar7 != null) {
                                    d2 += azVar7.d();
                                }
                                if (beVar16 != null) {
                                    i11 += beVar16.z[i17].d();
                                }
                                if (auVar2 != null) {
                                }
                                beVar18 = beVar4;
                                beVar14 = beVar19;
                                beVar17 = beVar20;
                                beVar16 = beVar18;
                                beVar4 = beVar17;
                            }
                        } else {
                            azVar7 = beVar15.z[i3];
                            beVar19 = beVar14;
                        }
                        auVar6 = azVar7.f;
                        beVar20 = beVar15;
                        auVar9 = beVar4.z[i17].f;
                        if (azVar7 != null) {
                            d2 += azVar7.d();
                        }
                        if (beVar16 != null) {
                            i11 += beVar16.z[i17].d();
                        }
                        if (auVar2 != null) {
                        }
                        beVar18 = beVar4;
                        beVar14 = beVar19;
                        beVar17 = beVar20;
                        beVar16 = beVar18;
                        beVar4 = beVar17;
                    }
                } else if (!(obj2 == null || beVar7 == null)) {
                    az azVar8;
                    i11 = ayVar.j;
                    obj9 = (i11 <= 0 || ayVar.i != i11) ? null : 1;
                    beVar16 = beVar7;
                    beVar4 = beVar16;
                    while (beVar4 != null) {
                        beVar12 = beVar4.Z[i4];
                        if (beVar4 == beVar7 || beVar4 == beVar6 || beVar12 == null) {
                            beVar17 = beVar4;
                            beVar4 = beVar12;
                        } else {
                            be beVar21;
                            au auVar10;
                            az azVar9;
                            be beVar22;
                            beVar15 = beVar12 == beVar6 ? null : beVar12;
                            azVar5 = beVar4.z[i3];
                            auVar2 = azVar5.f;
                            d2 = i3 + 1;
                            auVar3 = beVar16.z[d2].f;
                            i11 = azVar5.d();
                            i17 = beVar4.z[d2].d();
                            if (beVar15 != null) {
                                azVar7 = beVar15.z[i3];
                                beVar21 = beVar15;
                                auVar10 = azVar7.f;
                                azVar8 = azVar7.c;
                                azVar9 = azVar7;
                                auVar = azVar8 != null ? azVar8.f : null;
                            } else {
                                beVar21 = beVar15;
                                azVar7 = beVar4.z[d2].c;
                                if (azVar7 != null) {
                                    auVar9 = azVar7.f;
                                    azVar9 = azVar7;
                                } else {
                                    azVar9 = azVar7;
                                    auVar9 = null;
                                }
                                auVar = beVar4.z[d2].f;
                                auVar10 = auVar9;
                            }
                            if (azVar9 != null) {
                                i17 += azVar9.d();
                            }
                            i10 = i17;
                            if (beVar16 != null) {
                                i11 += beVar16.z[d2].d();
                            }
                            d2 = i11;
                            d3 = obj9 != null ? 6 : 4;
                            if (auVar2 == null || auVar3 == null || auVar10 == null || auVar == null) {
                                beVar17 = beVar4;
                                beVar22 = beVar21;
                            } else {
                                beVar22 = beVar21;
                                beVar17 = beVar4;
                                aoVar.a(auVar2, auVar3, d2, 0.5f, auVar10, auVar, i10, d3);
                            }
                            beVar4 = beVar22;
                        }
                        beVar16 = beVar17;
                    }
                    azVar2 = beVar7.z[i3];
                    azVar3 = beVar14.z[i3].c;
                    i9 = i3 + 1;
                    azVar6 = beVar6.z[i9];
                    azVar8 = beVar5.z[i9].c;
                    if (azVar3 != null) {
                        if (beVar7 != beVar6) {
                            aoVar2.c(azVar2.f, azVar3.f, azVar2.d(), 5);
                            azVar2 = azVar8;
                            azVar3 = azVar6;
                        } else if (azVar8 != null) {
                            az azVar10 = azVar8;
                            azVar3 = azVar6;
                            aoVar.a(azVar2.f, azVar3.f, azVar2.d(), 0.5f, azVar6.f, azVar8.f, azVar6.d(), 5);
                            azVar2 = azVar10;
                        }
                        if (!(azVar2 == null || beVar7 == beVar6)) {
                            aoVar2.c(azVar3.f, azVar2.f, -azVar3.d(), 5);
                        }
                    }
                    azVar3 = azVar6;
                    azVar2 = azVar8;
                    aoVar2.c(azVar3.f, azVar2.f, -azVar3.d(), 5);
                }
            } else {
                az[] azVarArr6 = beVar3.z;
                azVar2 = azVarArr6[i3];
                i9 = i3 + 1;
                azVar5 = beVar9.z[i9];
                auVar6 = azVarArr6[i3].c != null ? azVarArr6[i3].c.f : null;
                azVarArr = beVar9.z;
                auVar = azVarArr[i9].c != null ? azVarArr[i9].c.f : null;
                if (beVar10 == beVar11) {
                    az[] azVarArr7 = beVar10.z;
                    az azVar11 = azVarArr7[i3];
                    azVar5 = azVarArr7[i9];
                    azVar2 = azVar11;
                }
                if (auVar6 == null || auVar == null) {
                    beVar14 = beVar11;
                    beVar7 = beVar10;
                    beVar5 = beVar9;
                    i6 = i8;
                } else {
                    float f7 = i4 == 0 ? beVar2.P : beVar2.Q;
                    i5 = azVar2.d();
                    i15 = azVar5.d();
                    auVar2 = azVar2.f;
                    au auVar11 = azVar5.f;
                    auVar5 = auVar2;
                    auVar2 = auVar6;
                    beVar14 = beVar11;
                    i12 = i5;
                    beVar4 = beVar10;
                    float f8 = f7;
                    beVar15 = beVar9;
                    auVar4 = auVar;
                    auVar = auVar11;
                    beVar5 = beVar15;
                    i10 = i15;
                    beVar7 = beVar4;
                    i6 = i8;
                    aoVar.a(auVar5, auVar2, i12, f8, auVar4, auVar, i10, 5);
                }
                beVar6 = beVar14;
            }
            if (!((obj4 == null && obj2 == null) || beVar7 == null)) {
                azVar3 = beVar7.z[i3];
                i11 = i3 + 1;
                azVar2 = beVar6.z[i11];
                az azVar12 = azVar3.c;
                auVar2 = azVar12 != null ? azVar12.f : null;
                azVar = azVar2.c;
                auVar3 = azVar != null ? azVar.f : null;
                if (beVar5 != beVar6) {
                    azVar = beVar5.z[i11].c;
                    auVar3 = azVar != null ? azVar.f : null;
                }
                auVar4 = auVar3;
                if (beVar7 == beVar6) {
                    azVarArr6 = beVar7.z;
                    azVar11 = azVarArr6[i3];
                    azVar2 = azVarArr6[i11];
                    azVar3 = azVar11;
                }
                if (!(auVar2 == null || auVar4 == null)) {
                    i12 = azVar3.d();
                    if (beVar6 != null) {
                        beVar5 = beVar6;
                    }
                    aoVar.a(azVar3.f, auVar2, i12, 0.5f, auVar4, azVar2.f, beVar5.z[i11].d(), 5);
                }
            }
            i5 = i6 + 1;
            i2 = i7;
            bhVar2 = bhVar;
        }
    }
}
