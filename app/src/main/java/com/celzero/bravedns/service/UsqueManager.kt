package com.celzero.bravedns.service

import com.celzero.bravedns.tunnel.WarpTunnel

object UsqueManager {

    private var currentTunnel: WarpTunnel? = null

    fun initializeTunnel(tunnel: WarpTunnel) {
        currentTunnel = tunnel
    }

    fun startTunnel() {
        currentTunnel?.start()
    }

    fun stopTunnel() {
        currentTunnel?.stop()
    }

    fun getTunnelStatus(): String {
        return currentTunnel?.status ?: "No active tunnel"
    }

    fun isTunnelActive(): Boolean {
        return currentTunnel != null && currentTunnel!!.isActive
    }
}