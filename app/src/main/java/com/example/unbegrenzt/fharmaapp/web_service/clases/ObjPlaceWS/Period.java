
/*
 * Created  by unbegrenzt for Jorge Luis Morales Centeno on 10-11-17 01:16 PM
 * Copyright (c) 2017. All rights reserved.
 *
 * Last modified 10-03-17 05:25 AM
 */

package com.example.unbegrenzt.fharmaapp.web_service.clases.ObjPlaceWS;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Period {

    @SerializedName("close")
    @Expose
    private Close close;
    @SerializedName("open")
    @Expose
    private Open open;

    public Close getClose() {
        return close;
    }

    public void setClose(Close close) {
        this.close = close;
    }

    public Open getOpen() {
        return open;
    }

    public void setOpen(Open open) {
        this.open = open;
    }

}
