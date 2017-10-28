/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *  
 *      http://www.apache.org/licenses/LICENSE-2.0
 *  
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.wuwang.aavt.media;

import com.wuwang.aavt.egl.EGLHelper;

/**
 * RenderBean
 *
 * @author wuwang
 * @version v1.0 2017:10:27 15:02
 */
public class RenderBean {

    public EGLHelper egl;
    public int sourceWidth;
    public int sourceHeight;
    public int textureId;
    public boolean endFlag;

    public long timeStamp;
    public long textureTime;

    public long threadId;

}

