/*
 *  Copyright (C) 2010-2015 JPEXS, All rights reserved.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3.0 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library.
 */
package com.jpexs.decompiler.flash.tags;

import com.jpexs.decompiler.flash.SWF;
import com.jpexs.decompiler.flash.SWFInputStream;
import com.jpexs.helpers.ByteArrayRange;
import java.io.IOException;

/**
 *
 *
 * @author JPEXS
 */
public class TagStub extends Tag {

    private final SWFInputStream dataStream;

    /**
     * Constructor
     *
     * @param swf
     * @param id
     * @param data
     * @param name
     * @param sis
     */
    public TagStub(SWF swf, int id, String name, ByteArrayRange data, SWFInputStream sis) {
        super(swf, id, name, data);
        dataStream = sis;
    }

    @Override
    public final void readData(SWFInputStream sis, ByteArrayRange data, int level, boolean parallel, boolean skipUnusualTags, boolean lazy) throws IOException {
    }

    /**
     * Gets data bytes
     *
     * @return Bytes of data
     */
    @Override
    public byte[] getData() {
        throw new Error("TagStub.getData call is not supported.");
    }

    public SWFInputStream getDataStream() {
        return dataStream;
    }
}
