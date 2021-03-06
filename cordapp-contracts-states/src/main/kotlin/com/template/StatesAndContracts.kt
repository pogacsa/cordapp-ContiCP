package com.template

import net.corda.core.contracts.CommandData
import net.corda.core.contracts.Contract
import net.corda.core.contracts.ContractState
import net.corda.core.identity.AbstractParty
import net.corda.core.transactions.LedgerTransaction
import net.corda.core.identity.Party
import java.util.*


// *****************
// * Contract Code *
// *****************
// This is used to identify our contract when building a transaction
val TEMPLATE_CONTRACT_ID = "com.template.TemplateContract"

class TemplateContract : Contract {
    // A transaction is considered valid if the verify() function of the contract of each of the transaction's input
    // and output states does not throw an exception.
    override fun verify(tx: LedgerTransaction) {
        // Verification logic goes here.
    }

    // Used to indicate the transaction's intent.
    interface Commands : CommandData {
        class Action : Commands
    }
}

// *********
// * State *
// *********
class NeedState(val value: Int,
                     val expDate: Date,
                     val Issuer: Party,
                     val PossibleInvestors: MutableList<Party>) : ContractState {
    var myparticipants : MutableList<Party> = (PossibleInvestors, Issuer)
    override val participants get() = PossibleInvestors
    var Orsichange: Int = 2
}



