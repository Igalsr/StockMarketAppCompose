package com.plcoding.stockmarketapp.data.mapper

import com.plcoding.stockmarketapp.data.local.CompanyListingEntity
import com.plcoding.stockmarketapp.domain.model.CompanyListing

fun CompanyListingEntity.toCompanyListing() : CompanyListing {
    return CompanyListing(
        name,
        symbol,
        exchange
    )
}

fun CompanyListing.toCompanyEntity() : CompanyListingEntity {
    return CompanyListingEntity(
        name,
        symbol,
        exchange
    )
}