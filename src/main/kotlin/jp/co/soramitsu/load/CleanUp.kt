package jp.co.soramitsu.load

import io.gatling.javaapi.core.CoreDsl
import io.gatling.javaapi.core.ScenarioBuilder
import jp.co.soramitsu.load.toolbox.BlueElectricalTape
import jp.co.soramitsu.load.toolbox.Grinder
import kotlinx.coroutines.runBlocking

class CleanUp {
    companion object {
        @JvmStatic
        fun apply() = runBlocking {
            CleanUp().applyScn()
        }
    }
    fun applyScn(): ScenarioBuilder {
        return pushGatWayCleanUpScn
    }

    val pushGatWayCleanUpScn = CoreDsl.scenario("pushGatWayCleanUpScn")
        .exec { Session ->
            Grinder()
            Session
        }
}