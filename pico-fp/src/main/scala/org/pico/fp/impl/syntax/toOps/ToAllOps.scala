package org.pico.fp.impl.syntax.toOps

import org.pico.fp.impl.syntax.ToOps

trait ToAllOps extends ToOps
    with ToApplicativeOps
    with ToApplyOps
    with ToBindOps
    with ToEqualOps
    with ToFunctorOps
    with ToOrderOps
    with ToSemigroupOps
    with ToTagOps
