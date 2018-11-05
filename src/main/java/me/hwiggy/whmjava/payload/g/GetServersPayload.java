/**
 * Generated by ramidzkh's awesome generator thingy
 */
package me.hwiggy.whmjava.payload.g;

import me.hwiggy.whmjava.payload.Payload;

/***
 * This class and its methods directly relate to the API documentation.
 * API documentation can be found at the￼ following URL:
 ￼* https://developers.whmcs.com/api-reference/getservers/
 */
public class GetServersPayload extends Payload {

    /*
     * Get servers.
     */
    public GetServersPayload() {
        super ("GetServers");
    }

    /***
     *
     * @param fetchStatus
     * @return
     */
    public GetServersPayload withFetchStatus(boolean fetchStatus) {
        append("fetchStatus", fetchStatus);

        return this;
    }
}