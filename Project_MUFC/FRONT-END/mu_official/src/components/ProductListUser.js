import {useEffect, useState} from "react";
import {findAll} from "../service/product/ProductService";

const ProductListUser = function () {
    const [product, setProduct] = useState([]);
    const productList = async () => {
        const result = await findAll();
        setProduct(result0);
    };

    useEffect(() => {
        productList();
    }, [])
    return (
        <>
            <Header />
            <div style={{ margin: "150px 0" }}>
                <div class="row mx-0 ">
                    <div class="event">
                        <div className="row mx-0 ps-5">
                            <div>
                                <h3
                                    style={{
                                        color: "#f26b38",
                                        fontSize: "24px",
                                        fontWeight: 600,
                                    }}
                                >
                                    Khuyến mãi - sự kiện
                                </h3>
                            </div>
                        </div>
                        <div class="row mx-0 ps-5">
                            {discounts.map((discount) => (
                                <div className="col-md-4 container" style={{ paddingTop: 20 }}>
                                    <div
                                        className="card"
                                        style={{ width: 400, backgroundColor: "rgb(0 0 0)" }}
                                    >
                                        <Link to={"/detail-discount/" + discount.idDiscount}>
                                            <img
                                                style={{ height: 400 }}
                                                src={discount.imageDiscount}
                                                className="image"
                                            />
                                            <div className="readmore">
                                                <p style={{ color: "white" }}>
                                                    <b>{discount.nameDiscount}</b>
                                                    <p>Ngày bắt đầu: {discount.dateStart}</p>
                                                    <p>Ngày kết thúc: {discount.dateEnd}</p>
                                                    <p>Giảm giá: {discount.percentDiscount}%</p>
                                                </p>
                                                <div className="text" style={{ marginTop: 200 }}>
                                                    Chi tiết
                                                </div>
                                            </div>
                                        </Link>
                                    </div>
                                </div>
                            ))}
                        </div>
                    </div>
                </div>
            </div>
            <Footer />

        </>
    )
}
export default ProductListUser;