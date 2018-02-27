package com.thomsonreuters.aws.reservation.impl;

import com.amazonaws.services.ec2.model.Reservation;
import com.thomsonreuters.aws.ec2.EC2s;
import com.thomsonreuters.aws.ec2.IEC2s;
import com.thomsonreuters.aws.reservation.IReservation;

public class ReservationImpl implements IReservation {

    private final Reservation _res;

    public ReservationImpl(Reservation reservation) {
        _res = reservation;
    }

    @Override
    public IEC2s getInstances() {
        return EC2s.create(_res.getInstances());
    }
    
    @Override
    public String toString() {
        return _res.toString();
    }
}
