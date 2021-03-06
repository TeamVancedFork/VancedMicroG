/*
 * Copyright (C) 2013-2017 microG Project Team
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.microg.gms.cast;

import android.content.Intent;
import android.util.Log;

import androidx.mediarouter.media.MediaRouteProvider;
import androidx.mediarouter.media.MediaRouter;

import su.litvak.chromecast.api.v2.ChromeCast;

public class CastMediaRouteController extends MediaRouteProvider.RouteController {
    private static final String TAG = CastMediaRouteController.class.getSimpleName();

    private final CastMediaRouteProvider provider;
    private final String routeId;
    private final ChromeCast chromecast;

    public CastMediaRouteController(CastMediaRouteProvider provider, String routeId, String address) {
        super();

        this.provider = provider;
        this.routeId = routeId;
        this.chromecast = new ChromeCast(address);
    }

    public boolean onControlRequest(Intent intent, MediaRouter.ControlRequestCallback callback) {
        Log.d(TAG, "unimplemented Method: onControlRequest: " + this.routeId);
        return false;
    }

    public void onRelease() {
        Log.d(TAG, "unimplemented Method: onRelease: " + this.routeId);
    }

    public void onSelect() {
        Log.d(TAG, "unimplemented Method: onSelect: " + this.routeId);
    }

    public void onSetVolume(int volume) {
        Log.d(TAG, "unimplemented Method: onSetVolume: " + this.routeId);
    }

    public void onUnselect() {
        Log.d(TAG, "unimplemented Method: onUnselect: " + this.routeId);
    }

    public void onUnselect(int reason) {
        Log.d(TAG, "unimplemented Method: onUnselect: " + this.routeId);
    }

    public void onUpdateVolume(int delta) {
        Log.d(TAG, "unimplemented Method: onUpdateVolume: " + this.routeId);
    }
}
