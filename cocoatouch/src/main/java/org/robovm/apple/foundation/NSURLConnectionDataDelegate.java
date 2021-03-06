/*
 * Copyright (C) 2013-2015 RoboVM AB
 *
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
package org.robovm.apple.foundation;

/*<imports>*/
import java.io.*;
import java.nio.*;
import java.util.*;
import org.robovm.objc.*;
import org.robovm.objc.annotation.*;
import org.robovm.objc.block.*;
import org.robovm.rt.*;
import org.robovm.rt.bro.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.rt.bro.ptr.*;
import org.robovm.apple.corefoundation.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.coredata.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coremedia.*;
import org.robovm.apple.security.*;
import org.robovm.apple.dispatch.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/NSURLConnectionDataDelegate/*</name>*/ 
    /*<implements>*/extends NSURLConnectionDelegate/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "connection:willSendRequest:redirectResponse:")
    NSURLRequest willSendRequest(NSURLConnection connection, NSURLRequest request, NSURLResponse response);
    @Method(selector = "connection:didReceiveResponse:")
    void didReceiveResponse(NSURLConnection connection, NSURLResponse response);
    @Method(selector = "connection:didReceiveData:")
    void didReceiveData(NSURLConnection connection, NSData data);
    @Method(selector = "connection:needNewBodyStream:")
    NSInputStream needNewBodyStream(NSURLConnection connection, NSURLRequest request);
    @Method(selector = "connection:didSendBodyData:totalBytesWritten:totalBytesExpectedToWrite:")
    void didSendBodyData(NSURLConnection connection, @MachineSizedSInt long bytesWritten, @MachineSizedSInt long totalBytesWritten, @MachineSizedSInt long totalBytesExpectedToWrite);
    @Method(selector = "connection:willCacheResponse:")
    NSCachedURLResponse willCacheResponse(NSURLConnection connection, NSCachedURLResponse cachedResponse);
    @Method(selector = "connectionDidFinishLoading:")
    void didFinishLoading(NSURLConnection connection);
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
