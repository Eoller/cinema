package com.eoller.cinemadb.cinemadb.util;

import java.util.Optional;
import java.util.stream.Stream;

public abstract class ParamsVerifier {

    public static boolean allRequiredParamsProvided(Optional... params){
        return !Stream.of(params).filter(param -> !param.isPresent()).findFirst().isPresent();
    }

}
