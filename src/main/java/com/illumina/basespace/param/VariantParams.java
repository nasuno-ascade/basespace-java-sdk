/**
* Copyright 2012 Illumina
* 
 * Licensed under the Apache License, Version 2.0 (the "License");
*  you may not use this file except in compliance with the License.
*  You may obtain a copy of the License at
*    http://www.apache.org/licenses/LICENSE-2.0
* 
 *  Unless required by applicable law or agreed to in writing, software
*  distributed under the License is distributed on an "AS IS" BASIS,
*  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
*  See the License for the specific language governing permissions and
*  limitations under the License.
*/

package com.illumina.basespace.param;

import javax.ws.rs.core.MultivaluedMap;


public class VariantParams extends PositionalQueryParams
{
    public VariantParams()
    {
 
    }
    
    public VariantParams(int startPosition, int endPosition, ReturnFormat format)
    {
        super(startPosition,endPosition);
        this.format = format;
    }


    private ReturnFormat format = ReturnFormat.json;
    public ReturnFormat getFormat()
    {
        return format;
    }
    public void setFormat(ReturnFormat format)
    {
        this.format = format;
    }

    @Override
    public MultivaluedMap<String, String> toMap()
    {
        MultivaluedMap<String,String>rtn = super.toMap();
        rtn.add("Format",getFormat().name());
        return rtn;
    }
    
    public static enum ReturnFormat
    {
        json,
        vcf
    }
    
}