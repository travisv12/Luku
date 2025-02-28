package service;

import model.entity.Reservation;
import model.dao.impl.ReservationDao;
import java.time.LocalDateTime;
import java.util.List;


public class ReservationService {
    private ReservationDao reservationDao;

    public ReservationService() {
        reservationDao = new ReservationDao();
    }

    public Reservation getReservationById(Long reservationId) {
        return reservationDao.getReservationById(reservationId);
    }

    public List<Reservation> getAllReservations() {
        return reservationDao.getAllReservations();
    }

    public void extendReservation(Long reservationId, LocalDateTime newDueDate) {
        reservationDao.extendReservation(reservationId, newDueDate);
        // new updated notification
//        notificationService.createNotificationForReservation(reservationId);
    }

    public void updateReservation(Reservation reservation) {
        reservationDao.updateReservation(reservation);
    }

    public List<Reservation> getReservationsByUserId(Long userId) {
        return reservationDao.getReservationsByUserId(userId);
    }


    public void createReservation(Reservation reservation) {
        Long reservationId = reservationDao.saveReservation(reservation);
    }

    public Reservation getReservationByUserAndBook(Long userId, Long bookId) {
        return reservationDao.getReservationByUserAndBook(userId, bookId);
    }


}
